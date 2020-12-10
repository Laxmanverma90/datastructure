package com.ds.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class LinkNode {
	
	private int data;
	private LinkNode node;
}