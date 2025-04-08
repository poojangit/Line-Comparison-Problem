class Line {
    Point start;
    Point end;

    // Constructor
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Method to calculate the length of a line
    double calculateLength() {
        return Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2));
    }

    // equals method to check equality of two lines based on their length
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return Double.compare(this.calculateLength(), line.calculateLength()) == 0;
    }

    // compareTo method to compare two lines
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}