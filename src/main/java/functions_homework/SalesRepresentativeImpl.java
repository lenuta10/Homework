package functions_homework;

public class SalesRepresentativeImpl implements ISalesRepresentative {

    @Override
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {

        for (int i = 0; i < reps.length - 1; i++)
            for (int j = 0; j < reps.length - i - 1; j++)
                if (reps[j].calculateRevenue() < reps[j + 1].calculateRevenue()) {
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = temp;
                }

        return reps;
    }
}
