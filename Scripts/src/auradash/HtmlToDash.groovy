package auradash

class HtmlToDash {
	
	static void main(def args){
		
		
		def mylist= [1,2,"Lars","4"]
		mylist.each{ println it }
	}
	
	class Component {
		File directory
		String namespace
		String name
		def attributeList
		String something
		
	}
		
}