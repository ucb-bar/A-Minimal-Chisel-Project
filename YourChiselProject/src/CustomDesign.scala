/**
 * CustomDesign.scala
 *
 * This file defines a custom Chisel design. It computes the sum of two 8-bit inputs and outputs the result.
 */

// Import standard Chisel libraries
import chisel3._
import chisel3.util._

/**
 * CustomDesign class
 *
 * This class defines a custom Chisel design. As an example, it computes the sum of two 8-bit inputs and outputs the
 * result.
 */
class CustomDesign extends Module {

  // Define the input and output ports
  val io = IO(new Bundle {
    val a = Input(UInt(8.W))
    val b = Input(UInt(8.W))
    val c = Output(UInt(8.W))
  })

  // Define a register to store the result
  val c_reg = Reg(UInt(8.W))

  // Compute the sum of the inputs and store the result in the register
  c_reg := io.a + io.b

  // Output the result
  io.c := c_reg
}
