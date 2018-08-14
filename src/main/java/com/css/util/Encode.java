package com.css.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encode {
	private static Encode single = null;

	public static Encode getInstance() {
		if (single == null) {
			synchronized (Encode.class) {
				if (single == null) {
					single = new Encode();
				}
			}
		}
		return single;
	}

	private static String zhPatten = "[\\u4e00-\\u9fa5]+";

	public static String encode(String str, String charset) throws UnsupportedEncodingException {
		str = str.replace(" ", "+");
		Pattern p = Pattern.compile(zhPatten);
		Matcher m = p.matcher(str);
		StringBuffer b = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(b, URLEncoder.encode(m.group(0), charset));

		}
		m.appendTail(b);
		return b.toString();
	}

}
