export const formatBudget = (budget: number) => {

    const params = {minimumFractionDigits: 2, maximumFractionDigits: 2};
    return new Intl.NumberFormat('pt-BR', params).format(budget);

}