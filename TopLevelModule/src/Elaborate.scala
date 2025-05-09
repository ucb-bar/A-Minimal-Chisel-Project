/**
 * Elaborate.scala
 *
 * This file is responsible for elaborating the Chisel design into SystemVerilog. It is the main entry point for
 * generating the hardware description.
 */

import circt.stage.ChiselStage

/**
 * Object responsible for elaborating the Chisel design into SystemVerilog. This is the main entry point for generating
 * the hardware description.
 */
object Elaborate extends App {

  // Configuration options for the CIRCT FIRRTL-to-SystemVerilog conversion
  val firtoolOptions = Array(
    "--lowering-options=" + List(
      // Disable local variables to ensure Yosys compatibility
      // @see https://github.com/llvm/circt/blob/main/docs/VerilogGeneration.md
      "disallowLocalVariables",
      // Disable packed arrays to ensure Yosys compatibility
      "disallowPackedArrays",
      // Use [<filename>:<line>] format for source location annotations
      "locationInfoStyle=wrapInAtSquareBracket"
    ).reduce(_ + "," + _) // Join options with commas
  )

  // Generate SystemVerilog file from the Chisel design
  // - Creates a new instance of CustomDesign
  // - Passes through command line arguments
  // - Applies firtool configuration options
  ChiselStage.emitSystemVerilogFile(new TopLevelModule.CustomDesign(), args, firtoolOptions)
}
