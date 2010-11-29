/*
 * @(#)RuntimeException.java	1.15 10/03/23
 *
 * Копирайт (c) 2006, Oracle и/или его филиалы. Все права защищены.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Использовать в соответствии с лицензией.
 */

package java.lang;

/**
 * <code>RuntimeException</code> является суперклассом таких исключений,
 * которые могут быть брошены во время нормальной операции виртуальной
 * машины Java. 
 * <p>
 * Метод не требует объявления в его <code>throws</code> предложении
 * каких-либо подклассов <code>RuntimeException</code>, которые могут
 * быть брошены во время выполнения метода, но не перехвачены.
 * 
 *
 * @author  Frank Yellin
 * @version 1.15, 03/23/10
 * @since   JDK1.0
 */
public class RuntimeException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    /** Конструирует новое исключение времени выполнения с <code>null</code> 
     * как его уточняющим сообщением. Причина не инициализируется и может 
     * впоследствии быть инициализирована вызовом {@link #initCause}.
     */
    public RuntimeException() {
        super();
    }

    /** Конструирует новое исключение времени выполнения с указанным уточняющим
     * сообщением. Причина не инициализируется и может впоследствии быть 
     * инициализирована вызовом {@link #initCause}.
     *
     * @param   message   уточняющее сообщение. Уточняющее сообщение сохраняется 
     *          для последующего получения методом {@link #getMessage()}.
     */
    public RuntimeException(String message) {
        super(message);
    }

    /**
     * Конструирует новое исключение времени выполнения с указанным уточняющим 
     * собщением и причиной. <p>Заметьте, что уточняющее сообщение, ассоциированное 
     * с <code>cause</code>, автоматически <i>не</i> включается в уточняющее сообщение 
     * этого исключения времени выполнения.
     *
     * @param  message уточняющее сообщение (которое сохраняется для последующего 
     *         получения методом {@link Throwable#getMessage()}).
     * @param  cause причина (которая сохраняется для последующего получения
     *         методом {@link Throwable#getCause()}). (Значение <tt>null</tt>
     *         допускается и сообщает, что причина несуществует или 
     *         неизвестна.)
     * @since  1.4
     */
    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /** Конструирует новое исключение времени выполнения с указанной причиной 
     * и уточняющим сообщением <tt>(cause==null ? null : cause.toString())</tt>
     * (которое обычно содержит класс и уточняющее сообщение причины (<tt>cause</tt>)). 
     * Этот конструктор полезен для исключений времени выполнения, которые 
     * являются несколько большим, чем обертками над другими кидаемыми объектами.
     *
     * @param  cause причина (которая сохраняется для последующего получения
     *         методом {@link #getCause()}). (Значение <tt>null</tt> допустимо,
     *         и указывает, что причина не существует или неизвестна.)
     *
     * @since  1.4
     */
    public RuntimeException(Throwable cause) {
        super(cause);
    }
}
