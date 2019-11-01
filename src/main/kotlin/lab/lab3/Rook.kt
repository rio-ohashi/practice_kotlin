package lab.lab3

class Rook : Piece() {
    override var value = 5
    override var isWhite = false
    
    override fun move() {
        println("Horizontally or vertically")
    }
    
    override fun toString() : String {
        return "Rook{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}