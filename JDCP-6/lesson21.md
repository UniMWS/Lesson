13.03.2023
---
# lesson21

## Лямбда-выражения и функциональные интерфейсы

	21.1		Лямбда-выражения

### Функциональный интерфейс в Java
+ Интерфейс, который содержит только один абстрактный метод. Основное назначение — использование в лямбда-выражениях и ссылках на методы
```java
@FunctionalInterface
interface MyFunctionalInterface<T> {
boolean test(T value);
}
```

Функциональный интерфейс `MyFunctionalInterface` имеет всего один метод без реализации `test()`, который принимает один аргумент типа `T`. Результатом выполнения метода `test()` является `boolean`.

> К функциональному интерфейсу можно добавить аннотацию `@FunctionalInterface`. Это не обязательно, но при наличии данной аннотации код не скомпилируется, если будет больше или меньше одного абстрактного метода
#

### Лямбда-выражения
Набор инструкций, которые можно:
+ сохранить в ссылочную переменную
+ передать в любой метод в качестве аргумента
+ вызвать в любой момент
+ исполнить один или несколько раз

> Основу лямбда-выражения составляет **лямбда-оператор**, который обозначается символом «->»

Этот оператор разделяет лямбда-выражение **на две части**:

+ левая часть — параметры выражения
+ правая — тело лямбда-выражения, где выполняется действие

Синтаксис:
```java
(параметры) -> {тело метода}
```
#### Структура
+ Имеют от 0 и более входных параметров
+ Параметры указываются либо явно, либо могут быть получены из контекста: **(int a)** можно записать как **(a)**
+ Параметры заключаются в круглые скобки и разделяются запятыми: **(a, b)** или **(int a, int b)** или **(String a, int b, float c)**
+ Без параметров необходимо использовать пустые круглые скобки: **() -> 42**
+ Для одного параметра без указания типа скобки можно опустить: **a -> return a*a**
+ Тело может содержать от 0 и более операторов
+ Если тело состоит из одного оператора, его можно не заключать в фигурные скобки, а возвращаемое значение можно указывать без ключевого слова **return**

#### Отложенное выполнение
Одним из ключевых моментов в использовании лямбда-выражений является отложенное выполнение. Иными словами, определённое в одном месте программы лямбда-выражение можем вызвать при необходимости неопределённое количество раз в различных частях программы

#### Применение отложенного выполнения
+ Код выполняется в отдельном потоке
+ Один и тот же код выполняется несколько раз
+ Код выполняется в результате какого-то события
+ Код выполняется только в том случае, когда он действительно необходим

#### Как это работает
Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определённого в функциональном интерфейсе.

Чтобы объявить и использовать лямбда-выражение, необходимо пройти ряд этапов:
1. определить ссылки на функциональный интерфейс:
```java
Comparator<String> comparator;
```
2. создать лямбда-выражения:
```java
comparator = (a, b) -> b.compareTo(a);
```
3. использовать лямбда-выражения в виде вызова метода интерфейса:
```java
Collections.sort(cities, comparator);
```

#### Обратите внимание
● Параметры лямбда-выражения соответствуют параметрам единственного метода `compare()` интерфейса `Comparator`, а результат соответствует возвращаемому результату метода интерфейса:
```java
@FunctionalInterface
public interface Comparator<T> {
int compare(T var1, T var2);
}
```
● В качестве тела метода `compare()` интерфейса `Comparator` нами реализован вызов у второго параметра `b` типа `String` метода `compareTo()`, который сравнивает объекты `a` и `b` и возвращает `int`:
```java
b.compareTo(a)
```
#

### Лямбда-выражение как аргумент

Пример: определим лямбда-выражение в качестве переменной и передадим её как аргумент функции:
```java
public static void main(String[] args) {
   List<String> cities = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");
   
   Comparator<String> comparator1 = (a, b) -> b.compareTo(a);
   Comparator<String> comparator2 = (a, b) -> a.compareTo(b);
   
   sortList(cities, comparator2);
}

public static <T> void sortList(List<T> list, Comparator<T> comparator) {
   list.sort(comparator);
   list.forEach(System.out::println);
}
```
> Переменная — это поименованная либо адресуемая иным способом область памяти, адрес которой можно использовать для осуществления доступа к данным
> Аргумент функции — это переменная, которая передаётся методу при его вызове
### Итоги
+ Лямбда-выражения позволяют писать быстрее и делать код более ясным
+ Лямбда-выражения можно выделить в отдельную переменную и передать в качестве аргумента в функцию
#
	21.2		Встроенные функциональные интерфейсы

+ Понятие и типы встроенных функциональных интерфейсах
+ Улучшение кода с помощью функциональных интерфейсов
### Встроенные функциональные интерфейсы
В JDK 8 было добавлено несколько встроенных функциональных интерфейсов, широко применяемых в Stream API.
+ Predicate<T>
+ Consumer<T>
+ Function<T,R>
+ Supplier<T>
+ UnaryOperator<T>
+ BinaryOperator<T>

#### Predicate
Функциональный интерфейс `Predicate<T>` проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение `true`. В качестве параметра лямбда-выражение принимает объект типа `T`:
```java
public interface Predicate<T> {
boolean test(T t);
}
```
Пример:
```java
Predicate<Integer> isPositive = x -> x >= 0;
System.out.println(isPositive.test(5)); // true
```

#### Function
Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
```java
public interface Function<T, R> {
R apply(T t);
}
```
Пример:
```java
Function<Integer, String> convert = x -> x + " долларов";
System.out.println(convert.apply(5)); // 5 долларов
```

#### Consumer
`Consumer<T>` выполняет некоторое действие над объектом типа `T`, при этом ничего не возвращая:
```java
public interface Consumer<T> {
void accept(T t);
}
```
Пример:
```java
Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
printer.accept(600); // 600 долларов
```

#### Supplier
`Supplier<T>` не принимает никаких аргументов, но возвращает объект типа `T`:
```java
public interface Supplier<T> {
T get();
}
```
Пример:
```java
Supplier<String> stringFactory = () -> "new";
String str = stringFactory.get();
System.out.println(str); // new
```

#### UnaryOperator
`UnaryOperator<T>` принимает в качестве параметра объект типа `T`, выполняет над ними операции и возвращает результат операций в виде объекта типа `T`:
```java
public interface UnaryOperator<T> {
T apply(T t);
}
```
Пример:
```java
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(5)); // 25
```

#### BinaryOperator
`BinaryOperator<T>` принимает в качестве параметра два объекта типа `T`, выполняет над ними бинарную операцию и возвращает результат в виде объекта типа `T`:
```java
public interface BinaryOperator<T> {
T apply(T t1, T t2);
}
```
Пример:
```java
BinaryOperator<Integer> multiply = (x, y) -> x * y;
System.out.println(multiply.apply(3, 5)); // 15
```

#### Свой функциональный интерфейс
Если ни один из встроенных интерфейсов не подходит для решения поставленной
задачи, то можно создать собственный функциональный интерфейс.

Зачастую, это используется при создании так называемых **колбэков** — объектов, которые определяются в классе **А** и передаются в качестве аргумента в класс **Б**:

```java
@FunctionalInterface
public interface OnDoneListener<T> {
void onDone(T v);
}
```

> Если необходимо вернуть результат работы класса **Б** в класс **А**, то у переданного ему **колбэка** необходимо вызвать метод функционального
интерфейса
+ это вообще как, о чём и где примеры?

### Итоги
+ Функциональный интерфейс — это интерфейс с одним абстрактным методом
+ Лямбда-выражение реализует метод, определённый в функциональном интерфейсе

	21.3		Ссылки на метод

1. Что такое ссылки на метод и как они работают
2. Виды ссылок на метод

### Ссылки на метод

#### Ссылка на статический метод
Можно ссылаться на статический метод класса.

Синтаксис:
```java
ContainingClass::staticMethodName
```

Создадим статический метод в классе `Main` и сделаем на него ссылку при реализации лямбда-выражения:

```java
public static void main(String[] args) {
Consumer<String> sayable = Main::saySomething;
sayable.accept("Hello, this is static method");
}
private static void saySomething(String s) {
System.out.println(s);
}
```

> В роли функционального интерфейса выступает интерфейс `Consumer` с одним методом без реализации `accept()`. В роли статического метода выступает метод `saySomething()`, который выводит в консоль строку

#### Ссылка на метод объекта
Можно ссылаться на метод экземпляра класса.

Синтаксис:
```java
containingObject::instanceMethodName
```

Создадим метод в классе Main и сделаем на него ссылку при реализации лямбда-выражения:
```java
public static void main(String[] args) {
Main main = new Main();
Consumer<String> sayable = main::saySomething;
sayable.accept("Hello, this is non-static method");
}
private void saySomething(String s) {
System.out.println(s);
}
```

> В роли функционального интерфейса выступает интерфейс `Consumer` с одним методом без реализации `accept()`. В роли метода выступает метод экземпляра класса `saySomething()`, который выводит в консоль строку

#### Ссылка на конструктор класса
Можно ссылаться на конструктор класса.
Синтаксис:
```java
ClassName::new
```
Определим функциональный интерфейс `Consumer` и класс `Main` с конструктором:
```java
public Main(String string) {
System. out.println(string);
}
public static void main(String[] args) {
Consumer<String> sayable = Main:: new;
sayable.accept( "Hello, this is Main class");
}
```

> В роли функционального интерфейса выступает интерфейс `Consume` с одним методом без реализации `accept()`. В качестве класса выступает `Main`, в конструктор которого передаётся строка и выводится в консоль

### Итоги
+ Лямбда-выражение можно заменить ссылкой на метод
+ Ссылки могут быть как на статические методы, так на методы объекта и на конструкторы объектов

---
[*мои конспекты*](./README.md)
