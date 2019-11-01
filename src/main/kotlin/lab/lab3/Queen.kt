package lab.lab3

class Queen : Piece() {
    override var value = 9
    override var isWhite = false
    
    override fun move() {
        println("Like bishop and rook")
    }
    
    override fun toString() : String {
        return "Queen{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}