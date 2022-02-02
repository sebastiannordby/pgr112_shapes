package io;

import shapes.Shape;

import java.util.Scanner;

public interface IReadShape<T extends Shape>  {
    T readShape(Scanner scanner);
}
