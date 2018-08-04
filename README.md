This project use SpringData to support CrudRepository
To do it, we need:
1. Update the pom.xml by adding 3 dependencies spring-data, hibernate-entitymanager, hibernate-jpa
2. Replace SessionFactory by EntityManagerFactory
3. Replace HibernateTransactionManager by using JPATransactionManager
4. In StudentService, instead of implementing our own CRUD we just need to define it as a interface and extends CrudRepository or JpaRepository

public interface StudentService extends CrudRepository<Student, Long> {
}

5. Inject StudentService into StudentController as usual.


--- Guide on git command ---
To switch the remote repo for a local repo
1. git remote -v
2. git remote set-url origin url_to_github_repo
3. git add .
4. git commit -m "Message"
5. git push -u origin master

---Commit changed code to the same repo---

3. git add .
4. git commit -m "Message"
5. git push -u origin master


