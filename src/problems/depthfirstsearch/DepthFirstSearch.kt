package problems.depthfirstsearch


class Node(val name: String) {
    val children = mutableListOf<Node>()
    
    fun depthFirstSearch(): List<String> {
        return depthFirstSearch(mutableListOf())
    }
    
    fun depthFirstSearch(array: MutableList<String>): List<String> {
        array.add(name)
        
        for (child in children) {
            child.depthFirstSearch(array)
        }
        
        return array
    }
}