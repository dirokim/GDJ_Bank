package com.winter.app.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistDAO wishlistDAO;
}
