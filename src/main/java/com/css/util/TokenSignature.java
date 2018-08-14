package com.css.util;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class TokenSignature {
	private static Logger LOGGER = LoggerFactory.getLogger(TokenSignature.class);

	private static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
			"f" };
	//
	// public static void main(String[] args) throws Exception {
	// long time = System.currentTimeMillis();
	// String token =
	// "96063edcb9f5d80926d14f70e491ff1b73463f70ddc2773a843bc98e4e4ca36f";
	// String queryString = "projectIds=13075,13076&baseKey=base-dp&timestamp="
	// + time;
	// String sign = getSignature(token, queryString);
	// System.out.println(sign);
	// }

	public static String getSignature(String token, String urlQuery) throws Exception {

		if (StringUtils.isNotBlank(urlQuery)) {
			try {
				urlQuery = URLDecoder.decode(urlQuery, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				LOGGER.error("根据basekey,timestamp生成模块需要的signature失败:", e);
				throw new Exception("根据basekey,timestamp生成模块需要的signature失败.", e);
			}
		}

		String[] paraArray = new String[] {};
		if (StringUtils.isNotBlank(urlQuery)) {
			String[] queryArray = urlQuery.split("&");
			paraArray = (String[]) ArrayUtils.addAll(queryArray, paraArray);
		}

		Arrays.sort(paraArray);

		StringBuffer buffer = new StringBuffer();
		buffer.append(token);
		buffer.append(":");

		for (int i = 0; i < paraArray.length; i++) {
			buffer.append(paraArray[i]);
			buffer.append("&");
		}
		buffer.deleteCharAt(buffer.length() - 1);
		buffer.append(":");
		buffer.append(token);

		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(buffer.toString().getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("根据basekey,timestamp生成模块需要的signature失败:", e);
			throw new Exception("根据basekey,timestamp生成模块需要的signature失败.", e);
		} catch (UnsupportedEncodingException e) {
			LOGGER.error("根据basekey,timestamp生成模块需要的signature失败:", e);
			throw new Exception("根据basekey,timestamp生成模块需要的signature失败.", e);
		}
		String encode = byteArrayToHexString(md.digest());
		return encode;
	}

	private static String byteArrayToHexString(byte[] byteArray) {
		StringBuffer sb = new StringBuffer();
		for (byte byt : byteArray) {
			sb.append(byteToHexString(byt));
		}
		return sb.toString();
	}

	private static String byteToHexString (byte byt) {
		int n = byt;
		if (n < 0)
			n = 256 + n;
		return hexDigits[n / 16] + hexDigits[n % 16];
	}
}
