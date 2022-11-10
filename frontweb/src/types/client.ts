import {Project} from './project';

export type Client = {
    id: number;
    name: string;
    city: string;
    country: string;
    address: string;
    zip: number;
    marketSegment: string;
    projects: Project [];
};