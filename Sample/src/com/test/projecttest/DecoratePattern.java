package com.test.projecttest;

public class DecoratePattern {

	 public static void main(String[] args) {
	//	Tree tree  = new TreeImpl();
		Tree tree  =  new AddLeaf(new AddBranch(new TreeImpl() )) ;
		System.out.println(tree.createTree());
	}
	 
}


interface  Tree{
	public String createTree() ;
}
class  TreeImpl implements  Tree {

	@Override
	public String createTree() {
		return "This is tree body";
	 }
	
}
abstract class TreeBuilder implements  Tree {
	Tree tree  ;
	public String createTree() {
	   return  tree.createTree();	
	}
}

class AddBranch implements  Tree   {
	
	Tree tree  ;  
	AddBranch(Tree  tree) {
		this.tree =tree ; 
	}
	@Override
	public String createTree() {
	    return tree.createTree() + ", added branches" ;	
	    
	}
	
}

class  AddLeaf implements  Tree {
	
	Tree tree  ;  
	AddLeaf(Tree  tree) {
		this.tree =tree ;  
	}
	@Override
	public String createTree() {
		return tree.createTree() + ", added Leaf" ;	
	    
	}
	
	
}

