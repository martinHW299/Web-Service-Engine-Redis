package com.boctool.ws_engine_redis.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Utilities {

    public static final String REGEX_BRACE_PATTER = "\\{\\{(.*?)\\}\\}";

    public static String determineQueryType(String query) {
        String trimmedQuery = query.trim().toUpperCase();
        if (trimmedQuery.startsWith("SELECT")) {
            return "SELECT";
        } else if (trimmedQuery.startsWith("INSERT")) {
            return "INSERT";
        } else if (trimmedQuery.startsWith("UPDATE")) {
            return "UPDATE";
        } else if (trimmedQuery.startsWith("DELETE")) {
            return "DELETE";
        } else {
            return "UNKNOWN";
        }
    }

    public static String convertTextToMd5(String query) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(query.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) sb.append(String.format("%02x", b));

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }
}
