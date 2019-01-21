package com.bridgelabz.behavioral.visitordesign;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
