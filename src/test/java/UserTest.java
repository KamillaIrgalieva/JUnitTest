import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testUser(){
        //Given - подготовка тестового окружения
        int id = 1;
        String name = "Петя";
        int age = 21;
        String expected = "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';

        //When - выполнение тестового сценария
        User sut = new User(1,"Петя",21);

        //Then - проверка
        Assertions.assertEquals(sut.toString(), expected);
    }
}
