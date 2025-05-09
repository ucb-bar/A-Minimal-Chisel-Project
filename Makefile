
BUILD_DIR = ./generated-src

PROJECT = YourChiselProject


.PHONY: verilog test help reformat checkformat clean

verilog:
	mkdir -p $(BUILD_DIR)
	./mill -i $(PROJECT).runMain Elaborate --target-dir $(BUILD_DIR)

test:
	./mill -i $(PROJECT).test

help:
	./mill -i $(PROJECT).runMain Elaborate --help

reformat:
	./mill -i __.reformat

check-format:
	./mill -i __.checkFormat

clean:
	-rm -rf $(BUILD_DIR)

