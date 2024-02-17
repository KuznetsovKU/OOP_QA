package org.example.HW5.logger;

import org.example.HW5.model.Number;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            return new Logger();
        } return instance;
    }

    private Logger() {
    }

    public StringBuilder getLog(String methodName, Number num1, Number num2, Number result) {
        StringBuilder log = new StringBuilder();
        log.append(LocalDateTime.now());
        log.append(": LOG: Вызван метод ");
        log.append(methodName);
        log.append(" первое переданное число: ");
        log.append(num1.toString());
        log.append(", второе переданное число: ");
        log.append(num2.toString());
        log.append(". Результат вычислений = ");
        log.append(result.toString());
        System.out.println(log);
        return log;
    }
}
