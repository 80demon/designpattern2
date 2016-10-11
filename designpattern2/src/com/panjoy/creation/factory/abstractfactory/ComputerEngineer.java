package com.panjoy.creation.factory.abstractfactory;

public class ComputerEngineer {
	/**
	 * ������װ����Ҫ��CPU
	 */
	private Cpu cpu = null;
	/**
	 * ������װ����Ҫ������
	 */
	private MainBoard mainboard = null;

	public void makeComputer(AbstractFactory af) {
		/**
		 * ��װ�����Ļ�������
		 */
		// 1:����׼����װ������Ҫ�����
		prepareHardwares(af);
		// 2:��װ����
		// 3:���Ի���
		// 4�������ͻ�
	}

	private void prepareHardwares(AbstractFactory af) {
		// ����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		// ���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�

		// ֱ������Ӧ�Ĺ�����ȡ
		this.cpu = af.createCpu();
		this.mainboard = af.createMainBoard();

		// ��������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCpu();
	}
}
