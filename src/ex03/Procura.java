package ex03;

import java.util.ArrayList;

import ex02.Experimento;

public class Procura {

	public static ArrayList<ExperimentoMonitorado> experimento(ExperimentoMonitorado base, int ciclos) {
		ArrayList<ExperimentoMonitorado> melhores = new ArrayList<ExperimentoMonitorado>();
		ArrayList<Experimento> aux = new ArrayList<Experimento>();
		melhores.add(base);
		
		for (ExperimentoMonitorado exp : melhores) {
			aux.add(exp.cloneMutant());
		}
		
		
		
		return melhores;
	}
	
}
