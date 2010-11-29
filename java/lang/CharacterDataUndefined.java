
/* @(#)CharacterDataUndefined.java.template	1.4 10/04/01
 *
 * Копирайт (c) 1994, 2002, Oracle и/или его филиалы. Все права защищены.
 *
 * Это программное обеспечение - проприетарная информация Oracle.
 * Использовать в соответствии с лицензией.
 *
 */

package java.lang;

/** Класс CharacterData инкапсулирует большие таблицы, найденные в 
    Java.lang.Character. */

class CharacterDataUndefined {

    static int getProperties(int ch) {
        return 0;
    }

    static int getType(int ch) {
        return Character.UNASSIGNED;
    }

    static boolean isLowerCase(int ch) {
        return false;
    }

    static boolean isUpperCase(int ch) {
        return false;
    }

    static boolean isTitleCase(int ch) {
        return false;
    }

    static boolean isDigit(int ch) {
        return false;
    }

    static boolean isDefined(int ch) {
        return false;
    }

    static boolean isLetter(int ch) {
        return false;
    }

    static boolean isLetterOrDigit(int ch) {
        return false;
    }

    static boolean isSpaceChar(int ch) {
        return false;
    }


    static boolean isJavaIdentifierStart(int ch) {
        return false;
    }

    static boolean isJavaIdentifierPart(int ch) {
        return false;
    }

    static boolean isUnicodeIdentifierStart(int ch) {
        return false;
    }

    static boolean isUnicodeIdentifierPart(int ch) {
        return false;
    }

    static boolean isIdentifierIgnorable(int ch) {
        return false;
    }

    static int toLowerCase(int ch) {
        return ch;
    }

    static int toUpperCase(int ch) {
        return ch;
    }

    static int toTitleCase(int ch) {
        return ch;
    }

    static int digit(int ch, int radix) {
        return -1;
    }

    static int getNumericValue(int ch) {
        return -1;
    }

    static boolean isWhitespace(int ch) {
        return false;
    }

    static byte getDirectionality(int ch) {
        return Character.DIRECTIONALITY_UNDEFINED;
    }

    static boolean isMirrored(int ch) {
        return false;
    }

    // может надо реализовать для JSR 204
    // static int toUpperCaseEx(int ch);
    // static char[] toUpperCaseCharArray(int ch);

}
