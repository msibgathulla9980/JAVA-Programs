package com.bridgelabz.behavioral.visitordesign;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
