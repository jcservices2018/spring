package com.util;

import org.apache.log4j.Logger;

public final class LoggerUtils {

	protected static Logger getInfoLogger() {
		return Logger.getLogger("infoLogger");
	}

	public static Logger getWarnLogger() {
		return Logger.getLogger("warnLogger");
	}

	public static Logger getErrorLogger() {
		return Logger.getLogger("errorLogger");
	}

	public static Logger getDebugLogger() {
		return Logger.getLogger("debugLogger");
	}

	public static Logger getFatalLogger() {
		return Logger.getLogger("fatalLogger");
	}

	public static void error(String message) {
		LoggerUtils.getErrorLogger().error(message);
	}

	public static void error(Throwable throwable) {
		LoggerUtils.getErrorLogger().error("", throwable);
	}

	public static void error(String message, Throwable throwable) {
		LoggerUtils.getErrorLogger().error(message, throwable);
	}

	public static void debug(Throwable throwable) {
		LoggerUtils.getDebugLogger().debug("", throwable);
	}

	public static void debug(String message) {
		LoggerUtils.getDebugLogger().debug(message);
	}

	public static void debug(String message, Throwable throwable) {
		LoggerUtils.getDebugLogger().debug(message, throwable);
	}

	public static void info(Throwable throwable) {
		LoggerUtils.getInfoLogger().info("", throwable);
	}

	public static void info(String message) {
		LoggerUtils.getInfoLogger().info(message);
	}

	public static void info(String message, Throwable throwable) {
		LoggerUtils.getInfoLogger().info(message, throwable);
	}

	public static void fatal(String message) {
		LoggerUtils.getFatalLogger().fatal(message);
	}

	public static void fatal(Throwable throwable) {
		LoggerUtils.getFatalLogger().fatal("", throwable);
	}

	public static void fatal(String message, Throwable throwable) {
		LoggerUtils.getFatalLogger().fatal(message, throwable);
	}

	public static void warn(String message) {
		LoggerUtils.getWarnLogger().warn(message);
	}

	public static void warn(Throwable throwable) {
		LoggerUtils.getFatalLogger().warn(null, throwable);
	}

	public static void warn(String message, Throwable throwable) {
		LoggerUtils.getFatalLogger().warn(message, throwable);
	}

}
