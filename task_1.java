@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectedResult = true;
	assertEquals("Если меньше 18 то возвращается ошибка", expectedResult, isAdult);// Напиши код здесь
}
