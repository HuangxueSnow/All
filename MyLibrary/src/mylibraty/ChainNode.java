/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibraty;

/**
 *
 * @author Administrator
 */
abstract public class ChainNode() {
	abstract public void insertAfter（);
	abstract public void insertBefore();
	abstract public void remove();
	abstract public ChainNode getNext();
	abstract public chainNode getPrevious();
	abstract public Object getElement();
}

