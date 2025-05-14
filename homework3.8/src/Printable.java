// I – Interface Segregation Principle
// We avoid forcing non-drawing shapes to implement draw() unnecessarily
interface Printable {
    void print();
}