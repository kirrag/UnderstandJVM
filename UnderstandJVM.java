public class JvmComprehension { // Загрузка (ClassLoader) класса JvmComprehension в Metaspace

    public static void main(String[] args) { // Создание фрейма main() в стеке
        int i = 1;                      // 1 Создание переменной типа int во фрейме main() стека
        Object o = new Object();        // 2 Создание объетка типа Object в Heap и создание ссылки во фрейме main()
        Integer ii = 2;                 // 3 Создание объекта типа Integer в heap и создание ссылки во фрейме main()
        printAll(o, i, ii);             // 4 Создание фрейма printAll() в стеке
        System.out.println("finished"); // 7 Создание фрейма println(), создание строки в heap, создание ссылки на 
										// эту стоку во фрейме println()
    }

    private static void printAll(Object o, int i, Integer ii) { // Создание ссылок на объекты и переменной во фрейме printALl()
        Integer uselessVar = 700;                   // 5 Создание объекта типа Integer в heap и создание ссылки на него во фрейме printAll()
        System.out.println(o.toString() + i + ii);  // 6 Создание фрейма println() в стеке, создание фрейма toString() в стеке, создание строки в heap,
													// создание, ссылки на эту строку во фрейме println()
    }
}

