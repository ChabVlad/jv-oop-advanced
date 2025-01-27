package core.basesyntax;

public class Main {

    private static final int FIGURE_QUANTITY = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_QUANTITY];
        for (int i = 0; i < (FIGURE_QUANTITY / 2); i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = (FIGURE_QUANTITY / 2); i < FIGURE_QUANTITY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
