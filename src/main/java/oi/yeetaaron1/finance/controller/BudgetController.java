package oi.yeetaaron1.finance.controller;

@RestController
@RequestMapping("/api/budget")
public class BudgetController{

  private final BudgetService budgetService;

  public BudgetController(BudgetService budgetService){
    this.budgetService = budgetService;
  }
}