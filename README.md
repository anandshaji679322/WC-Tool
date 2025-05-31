# CCWC - Custom Word Count Tool

A Java implementation of a word count utility similar to the Unix `wc` command. This tool provides functionality to count bytes, lines, words, and characters in files or from standard input.

## Features

- Count bytes in a file or stdin (`-c` flag)
- Count lines in a file or stdin (`-l` flag)
- Count words in a file or stdin (`-w` flag)
- Count characters in a file or stdin (`-m` flag)

## Requirements

- Java Runtime Environment (JRE) 8 or higher

## Usage

### Basic Syntax

```bash
java ccwc [option] [filename]
```

### Options

- `-c`: Count bytes
- `-l`: Count lines
- `-w`: Count words
- `-m`: Count characters

### Examples

1. Count bytes in a file:
```bash
java ccwc -c filename.txt
```

2. Count lines in a file:
```bash
java ccwc -l filename.txt
```

3. Count words in a file:
```bash
java ccwc -w filename.txt
```

4. Count characters in a file:
```bash
java ccwc -m filename.txt
```

5. Count from standard input:
```bash
echo "Hello World" | java ccwc -c
```

> **Note**: When using pipes (`|`) versus direct file input, you might see slightly different counts for byte (`-c`) and character (`-m`) options. This is because:
> - Direct file input (`java ccwc -c file.txt` or `java ccwc -m file.txt`) reads the file directly
> - Pipe input (`cat file.txt | java ccwc -c` or `cat file.txt | java ccwc -m`) processes the data through the pipe, which can affect counting
> 
> For most accurate results, use direct file input when possible. The line count (`-l`) and word count (`-w`) options are not affected by this difference.

## Error Handling

The tool handles various error cases:
- Invalid flags
- File not found
- IO exceptions
- Invalid usage

## Building

1. Compile the Java file:
```bash
javac ccwc.java
```

2. Run the program:
```bash
java ccwc [option] [filename]
```

## License

This project is open source and available under the MIT License.

## Contributing

Feel free to submit issues and enhancement requests! 