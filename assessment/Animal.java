package assessment;

public interface Animal { public String getName();}
interface Mamal { public String getName();} 
abstract class Otter implements Animal, Mamal {}
