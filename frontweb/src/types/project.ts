import {Task} from './task';
import {Client} from './client';

export type Project = {
    id: number;
    name: string;
    description: string;
    initialDate: string;
    dueData: string;
    status: string;
    imgUrl: string;
    smart: string;
    premises: string;
    risks: string;
    resources: string;
    budget:number;
    expenses: number;
    invoicing: number;
    owner: string;
    category: string;
    client: number;
    clientName: string;
    tasks: Task[];
};