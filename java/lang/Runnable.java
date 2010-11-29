/*
 * @(#)Runnable.java	1.27 10/03/23
 *
 * Копирайт (c) 2006, Oracle и/или его филиалы. Все права защищены.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Использовать в соответствии с лицензией.
 */

package java.lang;

/**
 * Интерфейс <code>Runnable</code> должен быть реализован любым классом,
 * чью инстанции предполагается выполнять потоком. Класс должен
 * определить безаргументный метод, называемый <code>run</code>.
 * <p>
 * Этот интерфейс разработан для обеспечения общего протокола для объектов,
 * которые желают выполнять код, пока они активны. Например,
 * <code>Runnable</code> реализуется классом <code>Thread</code>.
 * Активность просто означает, что поток быз запущен, но еще не был 
 * остановлен.
 * <p>
 * В дополнение, <code>Runnable</code> предоставляет средство для класса
 * быть активным не подклассируя <code>Thread</code>. Класс, который реализует
 * <code>Runnable</code>, может запускаться без подклассирования <code>Thread</code>,
 * инстанцируя инстанцию <code>Thread</code> и передавая себя в в него как 
 * цель. В большинстве случаев, должен использоваться интерфейс <code>Runnable</code>, 
 * если вы планируете переопределить только метод <code>run()</code> и не 
 * трогать другие методы <code>Thread</code>.
 * Это важно, потому что классы не должны подклассифицироваться, если только
 * программист не предназначает их для изменения или расширения фундаментального 
 * поведения класса.
 *
 * @author  Arthur van Hoff
 * @version 1.27, 03/23/10
 * @see     java.lang.Thread
 * @see     java.util.concurrent.Callable
 * @since   JDK1.0
 */
public
interface Runnable {
    /**
     * Когда объект, реализующий интерфейс <code>Runnable</code>, используется
     * для создания потока, запуск потока приводит к вызову метода объекта 
     * <code>run</code> в отдельно исполняемом потоке. 
     * 
     * <p>
     * В общем случае метод <code>run</code> может выполнять вообще любое 
     * действие.
     *
     * @see     java.lang.Thread#run()
     */
    public abstract void run();
}
