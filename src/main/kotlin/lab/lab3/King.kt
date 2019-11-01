package lab.lab3

class King : Piece() {
    override var value = 1000
    override var isWhite = false
    
    override fun move() {
        println("One square")
    }
    
    override fun toString() : String {
        return "King{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}