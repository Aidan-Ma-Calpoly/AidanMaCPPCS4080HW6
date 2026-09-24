//> Evaluating Expressions runtime-error-class turned Break
package com.craftinginterpreters.lox;

class Break extends RuntimeException {
    Break() {
        super(null, null, false, false);
    }
}
