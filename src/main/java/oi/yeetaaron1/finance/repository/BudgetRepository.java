package oi.yeetaaron1.finance.repository;

import java.util.List;

@Repostory
public interface BudgetRepository extends JpaRepository<Budget, Long> {
  List<Budget> findByUserId(Long userId);
}