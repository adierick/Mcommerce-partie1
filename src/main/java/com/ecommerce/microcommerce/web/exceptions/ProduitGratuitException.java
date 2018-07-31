package com.ecommerce.microcommerce.web.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The Class ProduitGratuitException.
 */
// Exception pour un prix = 0
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException{

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new produit gratuit exception.
	 *
	 * @param message the message
	 */
	public ProduitGratuitException(String message){
        super(message);
    }
}