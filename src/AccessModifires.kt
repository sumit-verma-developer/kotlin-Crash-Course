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

// private fun topLevelPrivate
// protected



// inheritance wala feture chate toh use kro open
open class ParentClass{
    protected val protectedInfo:String="protected"
}


class ChildClass:ParentClass(){
    fun getProtectedInfo
}



fun main(){
val publicObj=PublicClass()
println(publicObj.publicInfo) // Accessible
println(publicObj.showPrivateInfo()) 
val internalObj=InternalClass()
println(internalObj.internalInfo) 

}