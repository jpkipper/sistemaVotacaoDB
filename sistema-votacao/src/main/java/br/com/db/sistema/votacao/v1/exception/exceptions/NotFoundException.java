package br.com.db.sistema.votacao.v1.exception.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException
{
    public NotFoundException( String message )
    {
        super( message );
    }

    public NotFoundException( Throwable cause )
    {
        super( cause );
    }

    public NotFoundException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public HttpStatus getStatus()
    {
        return HttpStatus.NOT_FOUND;
    }
}