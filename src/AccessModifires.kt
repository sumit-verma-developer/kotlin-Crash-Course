// most important 
// Access Modifires

class PublicClass{
    val publicInfo:String="Public Info"
    private val privateInfo:String="Private Info"
    fun showPrivateInfo():String{
        return privateInfo
    }
}

// inetrnal class
internal class InternalClass{
    internal val internalInfo:String="Internal Info"
}




fun main(){
val publicObj=PublicClass()
println(publicObj.publicInfo) // Accessible
println(publicObj.showPrivateInfo()) 
val internalObj=InternalClass()
println(internalObj.internalInfo) 
}