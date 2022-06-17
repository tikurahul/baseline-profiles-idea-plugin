# Development Tasks

## Re-Generating the Lexer

* Remove the `WHITE_SPACE` token from the Lexer and the generated code.

```
{WHITE_SPACE}      { return WHITE_SPACE; }
```

* Rename the class to `Lexer`.

## Re-Generating the Parser Code

* Open `grammer.bnf` and from the context menu click `Generate Parser Code`.

## Building the plugin locally

```bash
./gradlew buildPlugin
```
