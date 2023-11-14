package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Repository;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
