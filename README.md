# A Minimal Chisel Project

A minimal Chisel project with [Mill build system](https://mill-build.org/mill/index.html). This template is designed to be a starting point for new Chisel projects.


## Directory Structure

- `.gitignore` - Tell git to ignore some artifacts in the project.

- `Makefile` - Rules to invoke the build system.

- `build.mill.scala` - The mill build file for the project.

- `YourChiselProject/src/main/scala/Elaborate.scala` - The main entry point for generating the hardware description files.

- `YourChiselProject/src/main/scala/YourChiselProject.scala` - The main Chisel code for the project.


## Getting Started

### Installing Mill

If this is your first time using the Mill build system, please install the toolchain following their [official instructions](https://mill-build.org/mill/cli/installation-ide.html#_vscode).

An example of the installation process is provided as follows:

Create a directory to store the toolchains.

```bash
mkdir -p ./toolchains/
```

Download the Mill binary and make it an executable.

```bash
curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/0.13.0-M0/mill -o ./toolchains/mill
chmod +x ./toolchains/mill
```

Add the toolchain to the PATH.

```bash
export PATH="$PATH:$(pwd)/toolchains"
```

Now, mill should be available in the command line.

```bash
mill --version
```

### Generating Verilog Files

To generate Verilog files, run the following command:

```bash
make verilog
```


## Code Style

This project follows the [Chisel Style Guide](https://github.com/ccelio/chisel-style-guide) and uses [Scalafmt](https://scalameta.org/scalafmt/) to enforce a consistent code style. 


## See Also

- [Chips Alliance Chisel Project Template](https://github.com/chipsalliance/chisel-template) - A template project for beginning new Chisel work
- [OSCPU Chisel Playground](https://github.com/OSCPU/chisel-playground) - Another version of the Chisel template supporting mill

