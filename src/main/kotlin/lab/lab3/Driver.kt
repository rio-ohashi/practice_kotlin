import lab.lab3.*

fun main() {
    val pieces = mutableListOf<Piece>()
    pieces.add(Pawn())
    pieces.add(Knight())
    pieces.add(Bishop())
    pieces.add(Rook())
    pieces.add(Queen())
    pieces.add(King())
    
    for (piece in pieces) {
        piece.move()
    }
    
    var p1 = Pawn()
    p1.isWhite = true
    p1.promote(Queen())
    var p2 = Pawn()
    p2.isWhite = true
    var p3 = Pawn()
    p3.isWhite = false
    var p4 = Pawn()
    p4.isWhite = false
    p4.promote(Queen())
    var p5 = Pawn()
    p5.isWhite = true
    p5.promote(Knight())
    
    println("p1 & p2 is ${p1.equals(p2)}")
    println("p1 & p4 is ${p1.equals(p4)}")
    println("p1 & p5 is ${p1.equals(p5)}")
    println("p2 & p3 is ${p2.equals(p3)}")
    println("p4 & p5 is ${p4.equals(p5)}")
}