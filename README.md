<a id="top"></a>

# JUnit 6 Kotlin Workshop

[![Kotlin](https://img.shields.io/badge/Kotlin-2.4.0-7F52FF.svg)](https://kotlinlang.org/)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Gradle](https://img.shields.io/badge/Gradle-Kotlin_DSL-02303A.svg)](https://gradle.org/)
[![JUnit](https://img.shields.io/badge/JUnit-6.1.2-green.svg)](https://junit.org/)
[![License](https://img.shields.io/badge/License-Apache_2.0-lightgrey.svg)](LICENSE)

A practical workshop with runnable examples of JUnit 6 features in Kotlin/JVM.

> **Related projects:**
>
> - [JUnit Workshop](https://github.com/a-oleynik/junit-workshop) — the complete Java counterpart of this Kotlin workshop
> - [Selenium Example (JUnit 6 branch)](https://github.com/a-oleynik/selenium-example/tree/junit6) — a real-world Java Selenium WebDriver framework built on JUnit 6

**⭐ Found it useful?** If this project helps you, please give it a star — it helps others discover the repository.

> [!NOTE]
> This project is a work in progress and is being expanded incrementally. The README documents only the examples that are already available in the repository.

## Table of contents

- [Who is this for?](#who-is-this-for)
- [Prerequisites](#prerequisites)
- [Versions](#versions)
- [Available examples](#available-examples)
- [Start here](#start-here)
- [Command examples](#command-examples)
- [Test report](#test-report)
- [Project structure](#project-structure)
- [Useful links](#useful-links)
- [License](#license)

[Back to top](#top)

## Who is this for?

| Audience                        | What you will get                                        |
|---------------------------------|----------------------------------------------------------|
| QA engineers new to JUnit 6     | Small runnable examples of core JUnit features           |
| Kotlin developers               | JUnit examples written with Kotlin/JVM syntax and idioms |
| Java developers learning Kotlin | Familiar JUnit concepts shown in Kotlin                  |
| Workshop facilitators           | A project that can be expanded topic by topic            |

[Back to top](#top)

## Prerequisites

| Tool   |           Version | Notes                                     |
|--------|------------------:|-------------------------------------------|
| JDK    |                21 | Used by the Kotlin JVM toolchain          |
| Gradle | Locally installed | The Gradle Wrapper has not been added yet |
| IDE    |               Any | IntelliJ IDEA is recommended              |

[Back to top](#top)

## Versions

| Component      | Version |
|----------------|--------:|
| Kotlin         | `2.4.0` |
| JUnit          | `6.1.2` |
| Java toolchain |    `21` |

[Back to top](#top)

## Available examples

| Feature                                                                        | Test class      |
|--------------------------------------------------------------------------------|-----------------|
| Basic assertions: equality, booleans, nullability, identity, and `fail`        | `AssertTest`    |
| Disabling a test method or an entire test class with `@Disabled`               | `DisabledTest`  |
| Test lifecycle with `@BeforeEach`, `@AfterEach`, `@BeforeAll`, and `@AfterAll` | `FixturesTest`  |
| Exception testing with `assertThrows`                                          | `ExceptionTest` |
| Time limits with `assertTimeout` and `@Timeout`                                | `TimeoutTest`   |

[Back to top](#top)

## Start here

The examples can be explored in this order:

1. `AssertTest` — learn the basic JUnit assertions.
2. `FixturesTest` — observe the test lifecycle.
3. `ExceptionTest` — verify expected exceptions.
4. `DisabledTest` — disable individual tests or a complete test class.
5. `TimeoutTest` — apply time limits to test execution.

[Back to top](#top)

## Command examples

The commands below use a locally installed Gradle because the project does not contain the Gradle Wrapper yet.

### Run all tests

```bash
gradle clean test
```

### Run a single test class

```bash
gradle test --tests "*AssertTest"
```

### Run a single test method

```bash
gradle test --tests "*AssertTest.assertEquals verifies multiplication result"
```

### Run multiple test classes

```bash
gradle test --tests "*AssertTest" --tests "*ExceptionTest"
```

### Compile and run all verification tasks

```bash
gradle clean build
```

### Build without running tests

```bash
gradle build -x test
```

### Run tests with additional diagnostic output

```bash
gradle test --info
```

[Back to top](#top)

## Test report

The `test` task generates a Gradle HTML report:

```text
build/reports/tests/test/index.html
```

[Back to top](#top)

## Project structure

```text
src/
├── main/kotlin/com/oleynik/qa/workshop/kotlin/junit/
│   ├── model/       # Example production models
│   └── Utils.kt     # Utility used by timeout examples
└── test/kotlin/com/oleynik/qa/workshop/kotlin/junit/
    └── general/     # Assertions, fixtures, exceptions, disabled tests, and timeouts
```

[Back to top](#top)

## Useful links

- [JUnit Workshop](https://github.com/a-oleynik/junit-workshop) — comprehensive JUnit examples in Java
- [TestNG Workshop](https://github.com/a-oleynik/testng-workshop) — companion TestNG examples for side-by-side comparison
- [Selenium Example (JUnit 6 branch)](https://github.com/a-oleynik/selenium-example/tree/junit6) — a real-world Selenium WebDriver framework built on JUnit 6
- [JUnit 6 Released — Clean-Up, Modernization & Minimal Disruption](https://medium.com/@andrei.oleynik/junit-6-released-clean-up-modernization-minimal-disruption-d3ecf11b64ad)
- [JUnit 6 User Guide](https://docs.junit.org/6.1.2/)
- [Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)
- [Gradle Kotlin DSL Primer](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
- [Testing JVM projects with Gradle](https://docs.gradle.org/current/userguide/java_testing.html)

[Back to top](#top)

## License

This project is licensed under the Apache License 2.0. See [LICENSE](LICENSE) for details.

[Back to top](#top)
