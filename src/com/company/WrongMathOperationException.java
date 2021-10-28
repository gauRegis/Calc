package com.company;


class WrongMathOperationException extends Exception
{
        public WrongMathOperationException() {}

        public WrongMathOperationException(String message)
        {
            super(message);
        }
}
