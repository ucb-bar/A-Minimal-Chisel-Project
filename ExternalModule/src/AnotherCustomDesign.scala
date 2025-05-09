/**
 * AnotherCustomDesign.scala
 *
 * This file defines a custom Chisel design. It computes the sum of two 8-bit inputs and outputs the result.
 */

package ExternalModule

// Import standard Chisel libraries
import chisel3._
import chisel3.util._

/**
 * CustomDesign class
 *
 * This class defines another custom Chisel design. As an example, it adds 1 to the input.
 */
class AnotherCustomDesign extends Module {

  // Define the input and output ports
  val io = IO(new Bundle {
    val x = Input(UInt(8.W))
    val y = Output(UInt(8.W))
  })

  io.y := io.x + 1.U
}
