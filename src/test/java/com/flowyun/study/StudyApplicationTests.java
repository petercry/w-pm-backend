package com.flowyun.study;

import com.flowyun.mp.generator.CodeGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        CodeGenerator.builder().createGenerator()
                .author("peter")
                .driverName("org.postgresql.Driver")
                .dbUser("peter")
                .dbPassword("123456")
                .dbUrl("jdbc:postgresql://localhost:5432/postgres")
                .includeTables(new String[]{"w_project_info"})
                .modulePackage("pmdemo")
                .topPackage("com.flowyun")
                .projectPath("/Users/peter/IdeaProjects/af-study-test")
                .add()
                .execute();
    }
}
