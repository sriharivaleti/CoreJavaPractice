# CoreJavaPractice

This repository is focused on practicing modern Java features, especially the Stream API.

## 1000 Stream API Challenges

A comprehensive collection of Stream API exercises has been added to help you build fluency with modern Java collection processing, transformation, filtering, grouping, parallelism, and custom collector patterns.

- See `STREAM_API_CHALLENGES.md` for the full list of 1000 Stream API challenges.
- Use the challenges as a daily practice routine or interview prep resource.

## Java 8 Features

This repository focuses on modern Java concepts introduced in Java 8, including:

### Core functional programming features

- Functional Interfaces
  - `Function<T,R>` - transforms one value to another
  - `Predicate<T>` - boolean-valued function for filtering and testing
  - `Consumer<T>` - accepts a value and performs side effects
  - `Supplier<T>` - supplies a value without input
  - `UnaryOperator<T>` / `BinaryOperator<T>` - specialized functions for same-type operations
- Lambda Expressions
  - concise anonymous functions such as `(x) -> x * 2`
  - simplify callbacks, event handlers, and stream operations
- Method References (`::` operator)
  - `ClassName::staticMethod`
  - `instance::instanceMethod`
  - `ClassName::new` for constructors
  - `ClassName::instanceMethod` for instance methods on an object passed as the first argument
  - Example: `list.stream().map(String::toUpperCase)`
- Default and Static Methods in Interfaces
  - interfaces can provide reusable behavior without breaking implementations
  - example: `default void log() { ... }`

### Stream API overview

Streams provide a fluent API for processing collections and sequences in a functional style.

#### Creating streams

- `Collection.stream()`
- `Collection.parallelStream()`
- `Stream.of(...)`
- `Arrays.stream(array)`
- `Stream.empty()`
- `Stream.generate(Supplier<T>)`
- `Stream.iterate(seed, UnaryOperator<T>)`
- `Files.lines(path)`
- `IntStream.range(start, end)` / `LongStream.rangeClosed(start, end)`
- `Stream.builder()`

#### Top 20 intermediate operations

1. `filter(Predicate<? super T>)`
2. `map(Function<? super T,? extends R>)`
3. `flatMap(Function<? super T,? extends Stream<? extends R>>)`
4. `distinct()`
5. `sorted()`
6. `sorted(Comparator<? super T>)`
7. `peek(Consumer<? super T>)`
8. `limit(long maxSize)`
9. `skip(long n)`
10. `mapToInt(ToIntFunction<? super T>)`
11. `mapToLong(ToLongFunction<? super T>)`
12. `mapToDouble(ToDoubleFunction<? super T>)`
13. `boxed()`
14. `flatMapToInt(Function<? super T,? extends IntStream>)`
15. `flatMapToLong(Function<? super T,? extends LongStream>)`
16. `flatMapToDouble(Function<? super T,? extends DoubleStream>)`
17. `unordered()`
18. `parallel()`
19. `sequential()`
20. `onClose(Runnable)`

#### Top 20 terminal operations

1. `forEach(Consumer<? super T>)`
2. `forEachOrdered(Consumer<? super T>)`
3. `collect(Collector<? super T,A,R>)`
4. `reduce(BinaryOperator<T>)`
5. `reduce(T identity, BinaryOperator<T>)`
6. `reduce(U identity, BiFunction<U,? super T,U>, BinaryOperator<U>)`
7. `count()`
8. `anyMatch(Predicate<? super T>)`
9. `allMatch(Predicate<? super T>)`
10. `noneMatch(Predicate<? super T>)`
11. `findFirst()`
12. `findAny()`
13. `toArray()`
14. `min(Comparator<? super T>)`
15. `max(Comparator<? super T>)`
16. `sum()` (primitive streams)
17. `average()` (primitive streams)
18. `summaryStatistics()` (primitive streams)
19. `iterator()`
20. `collect(Collectors.toList())` / `collect(Collectors.toSet())` / `collect(Collectors.toMap(...))`

#### Collectors and custom collectors

- `Collectors.toList()`, `Collectors.toSet()`, `Collectors.toMap()`
- `Collectors.groupingBy(...)`, `Collectors.partitioningBy(...)`
- `Collectors.joining(...)`
- `Collectors.summarizingInt(...)`, `Collectors.counting()`
- custom collectors using `Collector.of(...)`

### Optional

- `Optional.of(value)`, `Optional.ofNullable(value)`
- `orElse(defaultValue)`, `orElseGet(Supplier<? extends T>)`, `orElseThrow()`
- `ifPresent(Consumer<? super T>)`
- `map(Function<? super T,? extends U>)`, `flatMap(Function<? super T,Optional<U>>)`
- `filter(Predicate<? super T>)`
- use `Optional` to avoid `null` checks and reduce `NullPointerException` risk

### Date and Time API (`java.time`)

- `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `OffsetDateTime`
- `Duration`, `Period`
- `DateTimeFormatter` for parsing and formatting
- `Instant` for machine-friendly timestamps
- `ZoneId` / `ZoneOffset` for timezone-aware operations

### Multithreading and concurrency improvements

Java 8 introduced several modern concurrency improvements, including easier functional-style thread work and stronger async APIs.

- Lambda expressions simplify `Runnable` and `Callable` creation:
  - `new Thread(() -> doWork()).start();`
  - `executor.submit(() -> compute())`
- `CompletableFuture` for asynchronous, non-blocking workflows
  - `supplyAsync()`, `thenApply()`, `thenCompose()`, `exceptionally()`
- Parallel streams use the `ForkJoinPool` internally for data-parallel processing
  - `stream().parallel()` and `parallelStream()`
- Improved thread pool support via `ForkJoinPool` and the common pool
- `StampedLock` and `LongAdder` were added in Java 8 for better scalability (note: `LongAdder` is part of `java.util.concurrent.atomic`)
- `ConcurrentHashMap` enhancements for performance and reduced lock contention
- Immutable functional-style data processing via streams reduces shared-mutable-state bugs

Use this section as a quick Java 8 feature reference while working through the Stream API challenge set.

## Git Creation Steps

Follow these steps to create the repository, add the Stream API challenge resource, and push the changes to GitHub.

1. Create a new local repository and initialize Git:
   ```bash
   mkdir CoreJavaPractice
   cd CoreJavaPractice
   git init
   ```
2. Add your files, including `README.md` and `STREAM_API_CHALLENGES.md`:
   ```bash
   git add README.md STREAM_API_CHALLENGES.md
   ```
3. Commit your changes with a clear message:
   ```bash
   git commit -m "Add 1000 Stream API challenge list and README link"
   ```
4. Create a new GitHub repository named `CoreJavaPractice`, then add the remote:
   ```bash
   git remote add origin https://github.com/<your-username>/CoreJavaPractice.git
   ```
5. Push the local `main` branch to GitHub:
   ```bash
   git branch -M main
   git push -u origin main
   ```

These steps will create the repository, commit the challenge content, and publish it to GitHub so users can access the full Stream API practice set.
